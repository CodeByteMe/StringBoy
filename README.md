# StringBoy
> 一个简单的 Java 字符串操作库

 ## 开始使用
返回 BASE64 加密后的字符串
```
StringBoy.BASE64Encoder("java"); // "amF2YQ=="
```
返回 BASE64 解密后的字符串
```
StringBoy.BASE64Decoder("amF2YQ=="); // "java"
```
返回字符串出现的次数
```
StringBoy.count("abc123abc", "abc"); // 2
```
判断目标字符串是否包含一个字符串数组中的所有字符
```
StringBoy.containsAll("abc123abc", new String[]{"1","2","3"}); // true
```
判断目标字符串是否包含一个字符串数组中的某个任意字符，有存在一个及以上返回 true
```
StringBoy.containsAny("abc123abc", new String[]{"a","s","d"}); // true
```
取字符串开头的指定位数
```
StringBoy.first("abc123", 3); // "abc"
```
取字符串倒数的指定位数
```
StringBoy.last("abc123", 3); // "123"
```
截取指定字符串，start表示开始截取的字符串下标，end表示结束截取下标，end为负数时表示下标从字符串尾部开始。
```
StringBoy.slice("abc123", 1, 3); // "bc"
StringBoy.slice("abc123", 1, -1); // "bc12"
```
判断字符串是否为空，如字符串只包含空格、换行符等。
```
StringBoy.isBlank(" \n "); // true
```
判断字符串是否为数字
```
StringBoy.isNumber("123"); // true
```
使字符串首字母大写
```
StringBoy.upperFirst("abc"); // "Abc"
```
字符串内大写字母转小写，小写转大写。
```
StringBoy.swapCase("aBc"); // "AbC"
```

 ## 开源协议
 根据MIT许可证发布