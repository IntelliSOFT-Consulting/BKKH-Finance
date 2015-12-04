package org.openmrs.module.bkkh.api;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.bkkh.Costs;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by USER on 01/12/2015.
 */
public class CostsServiceTest extends BaseModuleContextSensitiveTest {

    @Autowired
    private CostsService costsService;

    @Test
    @Ignore
    public void should_getAllCosts() throws Exception {
        executeDataSet("costsDataset.xml");

        //Patient patient = Context.getPatientService().getPatient(5);

        List<Costs> costsList = costsService.getCosts(null);

        Assert.assertEquals(2, costsList.size());
    }
}
