# ShardingSphere
[https://shardingsphere.apache.org/document/current/cn/manual/sharding-jdbc/configuration/config-spring-boot/](https://shardingsphere.apache.org/document/current/cn/manual/sharding-jdbc/configuration/config-spring-boot/)

# Mybatis-Plus
[https://mybatis.plus/guide/crud-interface.html#mapper-crud-接口](https://mybatis.plus/guide/crud-interface.html#mapper-crud-接口)

# Docker-Mysql
[https://hub.docker.com/_/mysql](https://hub.docker.com/_/mysql)

# Mysql-BinLog-Replication
[https://dev.mysql.com/doc/refman/5.7/en/binlog-replication-configuration-overview.html](https://dev.mysql.com/doc/refman/5.7/en/binlog-replication-configuration-overview.html)
[https://dev.mysql.com/doc/refman/5.7/en/replication-howto.html](https://dev.mysql.com/doc/refman/5.7/en/replication-howto.html)

## Docker-Compose
1. docker-compose up -d
2. docker exec -it master0 /bin/bash 
3. master0> mysql -u root -p123456 < /etc/mysql/conf.d/repl.sql
4. exit
5. docker exec -it master0slave0 /bin/bash
6. master0slave0> mysql -u root -p123456 < /etc/mysql/conf.d/repl.sql
7. exit
8. loop master1 and master1slave0
9. now you have a mysql cluster with two master nodes and two slave nodes
