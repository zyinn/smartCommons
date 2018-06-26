## 服务端AES
加密：aesEncrypt(content, KEY) <br>
解密：aesDecrypt(content, KEY) <br>
（ 注：前端页面和服务端密钥要一致）
```xml
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
    <version>1.10</version>
</dependency>
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.4</version>
</dependency>
```
## 前端依赖 lib/aes/aes.min.js
---------------------
```xml

	    /**
     * 加密（需要先加载lib/aes/aes.min.js文件）
     * @param word 加密内容
     * @param key 密钥
     * @returns {*}
     */
    function encrypt(word,key){
        var key = CryptoJS.enc.Utf8.parse(key);
        var srcs = CryptoJS.enc.Utf8.parse(word);
        var encrypted = CryptoJS.AES.encrypt(srcs, key, {mode:CryptoJS.mode.ECB,padding: CryptoJS.pad.Pkcs7});
        return encrypted.toString();
    }
    
    /**
     * 解密
     * @param word 需要解密的内容
     * @param key 密钥
     * @returns {*}
     */
    function decrypt(word,key){
        var key = CryptoJS.enc.Utf8.parse(key);
        var decrypt = CryptoJS.AES.decrypt(word, key, {mode:CryptoJS.mode.ECB,padding: CryptoJS.pad.Pkcs7});
        return CryptoJS.enc.Utf8.stringify(decrypt).toString();
    }
```