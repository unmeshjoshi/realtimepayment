package com.npci.api.models;

import com.thoughtworks.xstream.XStream;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReqPayTest {

    @Test
    public void shouldSerializeReqPayRecord() {
        XStream xStream = new XStream();
        String xml = xStream.toXML(new ReqPay(new Head(), new Meta(), new Txn(), new Payer()));
        assertNotNull(xml);
    }

}