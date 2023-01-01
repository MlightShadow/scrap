package com.company.project.service.impl;

import com.company.project.dao.AccountMapper;
import com.company.project.dto.account.AccountDTO;
import com.company.project.dto.account.RegisterDTO;
import com.company.project.model.Account;
import com.company.project.service.AccountService;
import com.company.project.util.EncodeUtil;
import com.company.project.core.AbstractService;
import com.company.project.core.ServiceException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Condition;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2019/03/28.
 */
@Service
@Transactional
public class AccountServiceImpl extends AbstractService<Account> implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account addAccount(RegisterDTO dto) {

        // 判断用户名是否存在
        Condition condition = new Condition(Account.class);
        condition.createCriteria().andCondition("username=", dto.getUsername());
        List<Account> list = this.findByCondition(condition);

        if (list.size() > 0) {
            throw new ServiceException("用户名已存在");
        }

        Account account = new Account();

        byte bexpansion = 0;
        Byte expansion = new Byte(bexpansion);
        byte[] salt = EncodeUtil.salt();
        account.setSalt(salt);
        account.setVerifier(EncodeUtil.verifier(dto.getUsername(), dto.getPassword(), salt));
        account.setRegMail(dto.getRegmail());
        account.setEmail(dto.getRegmail());
        account.setExpansion(expansion);
        account.setUsername(dto.getUsername());
        try {
            account.setShaPassHash(EncodeUtil
                    .sha1(StringUtils.upperCase(dto.getUsername()) + ":" + StringUtils.upperCase(dto.getPassword())));
        } catch (Exception e) {
            throw new ServiceException("系统异常");
        }

        int rows = this.save(account);
        if (rows == 1) {
            return account;
        } else {
            throw new ServiceException("account添加失败");
        }
    }

    @Override
    public int updateAccount(String id, AccountDTO dto) {
        Account account = new Account();

        int rows = this.update(account);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("account更新失败");
        }
    }

    @Override
    public int deleteAccount(String id) {
        Account account = new Account();
        int rows = this.update(account);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("account删除失败");
        }
    }

}
