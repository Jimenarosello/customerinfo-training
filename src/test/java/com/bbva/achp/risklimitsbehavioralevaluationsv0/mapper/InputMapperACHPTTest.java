package com.bbva.achp.risklimitsbehavioralevaluationsv0.mapper;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.mapper.InputMapperACHPT;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1.RequestTransactionAchpt001_1;
import org.junit.Assert;
import org.junit.Test;


public class InputMapperACHPTTest {

    private final InputMapperACHPT inputMapperACHPT = new InputMapperACHPT();

    @Test
    public void whenInputIsOKThenReturnCorrectRequestClass() {
        RequestTransactionAchpt001_1 requestTransactionAchpt001_1 = inputMapperACHPT.map("customerId");

        Assert.assertNotNull(requestTransactionAchpt001_1);
        Assert.assertEquals("customerId", requestTransactionAchpt001_1.getCustomerId());
    }
}