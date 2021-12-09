package com.bbva.achp.risklimitsbehavioralevaluationsv0.dao;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.IAchptDao;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.impl.AchptDao;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1.RequestTransactionAchpt001_1;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1.ResponseTransactionAchpt001_1;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;
import com.bbva.jee.arq.spring.core.host.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AchptDaoTest {

    @InjectMocks
    private IAchptDao daoService = new AchptDao();

    @Mock
    private ServicioTransacciones asoService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void givenNoResultsThenReturnEmptyList() {
        when(asoService.invoke(any(), anyString())).thenReturn(null);

        List<BDtoOutListBehavioralEvaluationsGet> response = daoService.getCustomerInfo("customerId");

        assertNotNull(response);
        assertTrue(response.isEmpty());
    }

    @Test
    public void givenResultsThenRespondCorrectly() {
        ResponseTransactionAchpt001_1 asoResponse = new ResponseTransactionAchpt001_1();
        when(asoService.invoke(any(), anyString())).thenReturn(Collections.singletonList(asoResponse));

        List<BDtoOutListBehavioralEvaluationsGet> response = daoService.getCustomerInfo("customerId");

        verify(asoService, times(1)).invoke(RequestTransactionAchpt001_1.class, "customerId");

        assertNotNull(response);
        assertFalse(response.isEmpty());
    }
}