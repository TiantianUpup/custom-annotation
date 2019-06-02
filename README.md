# 自定义注解
### 模块介绍
- custom-annotation-demo1：自定义校验注解
- custom-annotation-demo2：自定义权限注解
- custom-annotation-demo3：自定义缓存注解
- custom-annotation-web：自定义注解测试
### 测试
#### 校验注解测试
- 实体类 User.java
```
 @Check(paramValues = {"man", "woman"})
 private String sex;
```
对需要校验的字段添加`@Check`注解
- Controller层
```
@PostMapping("/api/test")
public Object test(@Validated @RequestBody User user) {
    return "hello world";
}
```
- Postman模拟请求测试
不符合校验：
![符合校验规则](https://upload-images.jianshu.io/upload_images/9358011-723b974bb431fd6e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

  符合校验规则：
![符合校验规则](https://upload-images.jianshu.io/upload_images/9358011-22561c4605a2a650.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#### 权限注解测试
- Controller层
```
@GetMapping("/api/test")
@PermissionCheck(resourceKey = "test")
public Object testPermissionCheck() {
    return "hello world";
}
```
- Postman模拟请求测试
![权限校验通过](https://upload-images.jianshu.io/upload_images/9358011-8010cc7edc4370b1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
将`@PermissionCheck(resourceKey = "test")`替换为`@PermissionCheck(resourceKey = "testKey")`
![权限校验不通过](https://upload-images.jianshu.io/upload_images/9358011-7aa0d0da5be9925f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#### 缓存注解测试
- Controller层
```
@GetMapping("/api/cache")
@CustomCache(key = "test")
public Object testCustomCache() {
    return "don't hit cache";
}
```
- Postman模拟请求测试
![不命中缓存](https://upload-images.jianshu.io/upload_images/9358011-cf27537cf51b99f1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
将`@CustomCache(key = "test")`替换为`@CustomCache(key = "testKey")`
![命中缓存](https://upload-images.jianshu.io/upload_images/9358011-a04b1cf1ed6bcd30.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

了解更多：[]()


