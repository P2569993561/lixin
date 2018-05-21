package com.lixin.mapper;

import com.lixin.pojo.Receipt;
import com.lixin.pojo.ReceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiptMapper {
    int countByExample(ReceiptExample example);

    int deleteByExample(ReceiptExample example);

    int deleteByPrimaryKey(String receiptId);

    int insert(Receipt record);

    int insertSelective(Receipt record);

    List<Receipt> selectByExample(ReceiptExample example);

    Receipt selectByPrimaryKey(String receiptId);

    int updateByExampleSelective(@Param("record") Receipt record, @Param("example") ReceiptExample example);

    int updateByExample(@Param("record") Receipt record, @Param("example") ReceiptExample example);

    int updateByPrimaryKeySelective(Receipt record);

    int updateByPrimaryKey(Receipt record);
}