package com.imooc.oa.dao;

import com.imooc.oa.entity.ClaimVoucher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Repository("claimVoucherDao")
public interface ClaimVoucherDao {
    void save(ClaimVoucher claimVoucher);

    void update(ClaimVoucher claimVoucher);

    void delete(int vid);

    ClaimVoucher select(int vid);

    List<ClaimVoucher> selectByCreateSn(String csn);

    List<ClaimVoucher> selectByNextSn(String ndsn);
}
