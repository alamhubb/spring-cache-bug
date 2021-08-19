run TestcacheApplication

in browser url

https://localpc.qingchiapp.com:8097/app/hello?adCode=100000

## get success

```
//pom

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.4.9</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    
    
    <!--<dependencyManagement>
        <dependencies>
            &lt;!&ndash; https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-dependencies &ndash;&gt;
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>2.4.9</version>
                &lt;!&ndash; 所有依赖包的版本控制统一 &ndash;&gt;
                <type>pom</type>
                &lt;!&ndash;    仅支持type=pom，仅用来pom间互相引用，减少父pom体积&ndash;&gt;
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>-->
```

## get error
```
    <!--<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.4.9</version>
        <relativePath/> &lt;!&ndash; lookup parent from repository &ndash;&gt;
    </parent>-->
    
    <dependencyManagement>
        <dependencies>
            <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-dependencies -->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>2.4.9</version>
                <!-- 所有依赖包的版本控制统一 -->
                <type>pom</type>
                <!--    仅支持type=pom，仅用来pom间互相引用，减少父pom体积-->
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```