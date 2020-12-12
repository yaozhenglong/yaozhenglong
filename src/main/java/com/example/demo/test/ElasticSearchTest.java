package com.example.demo.test;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ElasticSearchTest {

    public static void main(String[] args) throws UnknownHostException {
        Settings settings = Settings.builder().put("cluster.name", "Yancey").build(); //如果集群的名字不是默认的elasticsearch，需指定
                //.put("client.transport.sniff", true) //自动嗅探
        TransportClient client = new PreBuiltTransportClient(settings);
        client.addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9301));
        client.addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9302));
        client.addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9303));
        System.out.println(client);
        client.admin().indices().prepareCreate("index_hello").get();
        client.close();
    }
}
