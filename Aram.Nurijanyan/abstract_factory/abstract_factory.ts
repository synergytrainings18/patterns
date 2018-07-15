//   ----------START---------- interfaces for products
interface Device {
    manufacturer : string;
    os : string;
    getInfo(): string;
}

interface Smartphone extends Device {
    screenResolution : number;
    color : string;
}

interface Ultrabook extends Device {
    keyboard : string;
    touchBar : boolean;
}

//   ----------END---------- interfaces for products

//=========================================

//   ----------START---------- interface for factory

interface DeviceFactory {
    createSmartphone(screenResolution: number, color: string): Smartphone;
    createUltrabook(keyboard: string, touchBar: boolean): Ultrabook;
}

//   ----------END---------- interface for factory

//=========================================

//   ----------START---------- implements for products' interfaces

class Iphone implements Smartphone {
    manufacturer : string = 'Apple Inc.';
    os : string = 'iOS';

    constructor(public screenResolution : number, public color : string) {
        this.screenResolution = screenResolution;
        this.color = color;
    }

    getInfo(): string {
        return `
            manufacturer: ${this.manufacturer},
            os: ${this.os},
            screeResolution: ${this.screenResolution},
            color: ${this.color}
        `;
    }
}

class MacBook implements Ultrabook {
    manufacturer : string = 'Apple Inc.';
    os : string = 'macOS';

    constructor(public keyboard : string, public touchBar : boolean) {
        this.keyboard = keyboard;
        this.touchBar = touchBar;
    }

    getInfo(): string {
        return `
            manufacturer: ${this.manufacturer},
            os: ${this.os},
            keyboardType: ${this.keyboard},
            touchBar: ${this.touchBar}
        `;
    }
}

class Zenfone implements Smartphone {
    manufacturer : string = 'AsusTek Computer Inc.';
    os : string =  'Android';

    constructor(public screenResolution : number, public color : string) {
        this.screenResolution = screenResolution;
        this.color = color;
    }

    getInfo(): string {
        return `
            manufacturer: ${this.manufacturer},
            os: ${this.os},
            screeResolution: ${this.screenResolution},
            color: ${this.color}
        `;
    }
}

class ZenBook implements Ultrabook {
    manufacturer : string = 'AsusTek Computer Inc.';
    os : string = 'Windows';

    constructor(public keyboard : string, public touchBar : boolean) {
        this.keyboard = keyboard;
        this.touchBar = touchBar;
    }

    getInfo(): string {
        return `
            manufacturer: ${this.manufacturer},
            os: ${this.os},
            keyboardType: ${this.keyboard},
            touchBar: ${this.touchBar}
        `;
    }
}

//   ----------END---------- implements for products' interfaces

//=========================================

//   ----------START---------- implements for factory's interface

class AsusFactory implements DeviceFactory {
    createSmartphone(screenResolution: number, color: string): Smartphone {
        return new Zenfone(screenResolution, color);
    }

    createUltrabook(keyboard: string, touchBar: boolean): Ultrabook {
        return new ZenBook(keyboard, touchBar);
    }
}

class AppleFactory implements DeviceFactory {
    createSmartphone(screenResolution: number, color: string): Smartphone {
        return new Iphone(screenResolution, color);
    }

    createUltrabook(keyboard: string, touchBar: boolean): Ultrabook {
        return new MacBook(keyboard, touchBar);
    }
}


//   ----------END---------- implements for factory's interface

// Use in client side
window.addEventListener('load', () => {
    let factory: DeviceFactory;
    const client = {
        hasMoreMoreMoney: true, // true - Apple, false - Asus 
        smartphones: [],
        ultrabooks: []
    };
    
    if(client.hasMoreMoreMoney) {
        factory = new AppleFactory();
    } else {
        factory = new AsusFactory();
    }

    client.smartphones.push(factory.createSmartphone(5.5, 'black'));
    client.smartphones.push(factory.createSmartphone(5, 'red'));
    client.ultrabooks.push(factory.createUltrabook('qwerty', true));
    client.ultrabooks.push(factory.createUltrabook('dvorak', false));

    console.log('Smartphones: ');
    client.smartphones.forEach(phone => {
        console.log(phone.getInfo());
    });

    console.log('Ultrabooks: ');
    client.ultrabooks.forEach(book => {
        console.log(book.getInfo());
    });

})