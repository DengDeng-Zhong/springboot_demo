### 入门springboot
#### tag1
1. 项目属性配置
   - 注解
   
        @Value 
   
        @Component
   
        @ConfigurationProperties
   
   - 多环境配置
   
        spring:profiles:active: dev 
        
 2. Controller的使用
    - 注解
    
        @Controller 处理http请求
        
        @RestController  Spring4之后新加的注解,原来返回json需要@ResponseBody配合Controller
        
        @RequestMapping  配置url映射
        
        @PathVariable  获取url中的变量值
        
        @RequestParam  获取请求参数的值
        
        @GetMapping  组合注解
        
 3. 数据库
 
     - 增删改查 