var MyIterator = (function () {
    function MyIterator(items) {
        this._index = 0;
        this._items = items;
    }
    MyIterator.prototype.first = function () {
        this.reset();
        return this.next();
    };
    MyIterator.prototype.reset = function () {
        this._index = 0;
    };
    MyIterator.prototype.hasNext = function () {
        return this._index <= this._items.length;
    };
    MyIterator.prototype.next = function () {
        return this._items[this._index++];
    };
    Object.defineProperty(MyIterator.prototype, "current", {
        get: function () {
            if (this._index < 0 || this._index > this._items.length - 1) {
                throw new Error("Invalid operation.");
            }
            return this._items[this._index];
        },
        enumerable: true,
        configurable: true
    });
    MyIterator.prototype.each = function (callback) {
        for (var item = this.first(); this.hasNext(); item = this.next()) {
            callback(item);
        }
    };
    return MyIterator;
}());
var Phone = (function () {
    function Phone(model, os) {
        this.model = model;
        this.os = os;
        this.model = model || "Sony";
        this.os = os || "Android";
    }
    return Phone;
}());
var PhoneStore = (function () {
    function PhoneStore(store) {
        this.store = store;
        this.store = store || [];
    }
    PhoneStore.prototype.getIterator = function () {
        return new MyIterator(this.store);
    };
    return PhoneStore;
}());
window.addEventListener("load", function () {
    var store = new PhoneStore([
        new Phone("Sony"),
        new Phone("Samsung"),
        new Phone("iPhone X", "iOS"),
        new Phone("iPhone 7s", "iOS"),
        new Phone("ArmPhone")
    ]);
    var iter = store.getIterator();
    iter.each(function (item) {
        console.log(item);
    });
});
