//   ----------END---------- interface for factory
//=========================================
//   ----------START---------- implements for products' interfaces
var Iphone = /** @class */ (function () {
    function Iphone(screenResolution, color) {
        this.screenResolution = screenResolution;
        this.color = color;
        this.manufacturer = 'Apple Inc.';
        this.os = 'iOS';
        this.screenResolution = screenResolution;
        this.color = color;
    }
    Iphone.prototype.getInfo = function () {
        return "\n            manufacturer: " + this.manufacturer + ",\n            os: " + this.os + ",\n            screeResolution: " + this.screenResolution + ",\n            color: " + this.color + "\n        ";
    };
    return Iphone;
}());
var MacBook = /** @class */ (function () {
    function MacBook(keyboard, touchBar) {
        this.keyboard = keyboard;
        this.touchBar = touchBar;
        this.manufacturer = 'Apple Inc.';
        this.os = 'macOS';
        this.keyboard = keyboard;
        this.touchBar = touchBar;
    }
    MacBook.prototype.getInfo = function () {
        return "\n            manufacturer: " + this.manufacturer + ",\n            os: " + this.os + ",\n            keyboardType: " + this.keyboard + ",\n            touchBar: " + this.touchBar + "\n        ";
    };
    return MacBook;
}());
var Zenfone = /** @class */ (function () {
    function Zenfone(screenResolution, color) {
        this.screenResolution = screenResolution;
        this.color = color;
        this.manufacturer = 'AsusTek Computer Inc.';
        this.os = 'Android';
        this.screenResolution = screenResolution;
        this.color = color;
    }
    Zenfone.prototype.getInfo = function () {
        return "\n            manufacturer: " + this.manufacturer + ",\n            os: " + this.os + ",\n            screeResolution: " + this.screenResolution + ",\n            color: " + this.color + "\n        ";
    };
    return Zenfone;
}());
var ZenBook = /** @class */ (function () {
    function ZenBook(keyboard, touchBar) {
        this.keyboard = keyboard;
        this.touchBar = touchBar;
        this.manufacturer = 'AsusTek Computer Inc.';
        this.os = 'Windows';
        this.keyboard = keyboard;
        this.touchBar = touchBar;
    }
    ZenBook.prototype.getInfo = function () {
        return "\n            manufacturer: " + this.manufacturer + ",\n            os: " + this.os + ",\n            keyboardType: " + this.keyboard + ",\n            touchBar: " + this.touchBar + "\n        ";
    };
    return ZenBook;
}());
//   ----------END---------- implements for products' interfaces
//=========================================
//   ----------START---------- implements for factory's interface
var AsusFactory = /** @class */ (function () {
    function AsusFactory() {
    }
    AsusFactory.prototype.createSmartphone = function (screenResolution, color) {
        return new Zenfone(screenResolution, color);
    };
    AsusFactory.prototype.createUltrabook = function (keyboard, touchBar) {
        return new ZenBook(keyboard, touchBar);
    };
    return AsusFactory;
}());
var AppleFactory = /** @class */ (function () {
    function AppleFactory() {
    }
    AppleFactory.prototype.createSmartphone = function (screenResolution, color) {
        return new Iphone(screenResolution, color);
    };
    AppleFactory.prototype.createUltrabook = function (keyboard, touchBar) {
        return new MacBook(keyboard, touchBar);
    };
    return AppleFactory;
}());
//   ----------END---------- implements for factory's interface
// Use in client side
window.addEventListener('load', function () {
    var factory;
    var client = {
        hasMoreMoreMoney: true,
        smartphones: [],
        ultrabooks: []
    };
    if (client.hasMoreMoreMoney) {
        factory = new AppleFactory();
    }
    else {
        factory = new AsusFactory();
    }
    client.smartphones.push(factory.createSmartphone(5.5, 'black'));
    client.smartphones.push(factory.createSmartphone(5, 'red'));
    client.ultrabooks.push(factory.createUltrabook('qwerty', true));
    client.ultrabooks.push(factory.createUltrabook('dvorak', false));
    console.log('Smartphones: ');
    client.smartphones.forEach(function (phone) {
        console.log(phone.getInfo());
    });
    console.log('Ultrabooks: ');
    client.ultrabooks.forEach(function (book) {
        console.log(book.getInfo());
    });
});
