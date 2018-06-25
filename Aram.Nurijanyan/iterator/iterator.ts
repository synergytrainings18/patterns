interface MyIterable<T> {
    getIterator(): MyIterator<T>;
}

class MyIterator<T> {
    private _index: number = 0;
    private _items: T[];
    
    constructor(items: T[]) {
        this._items = items;
    }

    public first(): T {
        this.reset();
        return this.next();
    }

    public reset(): void {
        this._index = 0;
    }

    public hasNext(): boolean {
        return this._index <= this._items.length;
    }

    public next(): T {
        return this._items[this._index++];
    }

    get current(): T {
        if (this._index < 0 || this._index > this._items.length - 1) {
            throw new Error("Invalid operation.");
        }
        return this._items[this._index];
    }

    public each(callback: Function): void {
        for (let item = this.first(); this.hasNext(); item = this.next()) {
            callback(item);
        }
    }
}

class Phone {
    constructor(public model: string, public os?: string) {
        this.model = model || "Sony";
        this.os = os || "Android";
    }
}

class PhoneStore implements MyIterable<Phone> {
    constructor(public store: Phone[]) {
        this.store = store || [];
    }

    public getIterator(): MyIterator<Phone> {
        return new MyIterator(this.store);
    }
}

window.addEventListener("load", () => {
    const store = new PhoneStore([
        new Phone("Sony"),
        new Phone("Samsung"),
        new Phone("iPhone X", "iOS"),
        new Phone("iPhone 7s", "iOS"),
        new Phone("ArmPhone")
    ]);


    const iter = store.getIterator();

    iter.each(item => {
        console.log(item);
    })
})