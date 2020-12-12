package com.example.demo.test;

import java.io.IOException;
import java.net.InetAddress;

import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.admin.indices.alias.Alias;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public class ElasticSearchClientTest {

    public static void main(String[] args) throws IOException {
        TransportClient client = null;


        //获取client


//        Settings settings = Settings.builder()
//                .put("cluster.name", "elasticsearch_brew") //如果集群的名字不是默认的elasticsearch，需指定
//                //.put("client.transport.sniff", true) //自动嗅探
//                .build();
//        TransportClient client = new PreBuiltTransportClient(settings)
//                //.addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));
//                .addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
//        System.out.println(client);
        //client.admin().indices().prepareCreate("index_hello").get();


        try {

            // 一、建立 建立索引request 参数：索引名index_hello
            CreateIndexRequest request = new CreateIndexRequest("mess");

            // 二、设置索引的settings
            request.settings(Settings.builder().put("index.number_of_shards", 3) // 分片数
                    .put("index.number_of_replicas", 2) // 副本数
                    .put("analysis.analyzer.default.tokenizer", "ik_smart") // 默认分词器
            );

            // 三、设置索引的mappings
            request.mapping("_doc",
                    "  {\n" +
                            "    \"_doc\": {\n" +
                            "      \"properties\": {\n" +
                            "        \"message\": {\n" +
                            "          \"type\": \"text\"\n" +
                            "        }\n" +
                            "      }\n" +
                            "    }\n" +
                            "  }",
                    XContentType.JSON);

            // 四、 设置索引的别名
            request.alias(new Alias("mmm"));

            // 五、 发送请求
            // 5.1 同步方式发送请求

            /*
            CreateIndexResponse createIndexResponse = client.indices().create(request);

            // 六、处理响应
            boolean acknowledged = createIndexResponse.isAcknowledged();
            boolean shardsAcknowledged = createIndexResponse
                    .isShardsAcknowledged();
            System.out.println("acknowledged = " + acknowledged);
            System.out.println("shardsAcknowledged = " + shardsAcknowledged);

             */
        } catch (Exception e) {
            e.printStackTrace();
        }


        //client.admin().indices().prepareCreate("index_hello").get();

        //client.close();
    }
}
