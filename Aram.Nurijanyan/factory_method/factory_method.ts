enum Extension {
    pdf, xlsx, rtf
}

enum ExportFileType {
    PDF, EXCEL, RTF
}

interface ExportFile {
    fileName: string;
    data: any;
    getExtension(): Extension;
}

class PdfExportFile implements ExportFile {
    
    constructor(public fileName: string,  public data: any) {
        this.fileName = fileName;
        this.data = data;
    }

    getExtension(): Extension {
        return Extension.pdf;
    }
}

class ExcelExportFile implements ExportFile {
    
    constructor(public fileName: string,  public data: any) {
        this.fileName = fileName;
        this.data = data;
    }

    getExtension(): Extension {
        return Extension.xlsx;
    }
}

class RtfExportFile implements ExportFile {
    
    constructor(public fileName: string,  public data: any) {
        this.fileName = fileName;
        this.data = data;
    }

    getExtension(): Extension {
        return Extension.rtf;
    }
}

class ExportFileFactory {

    createExportFile(fileName: string, type: ExportFileType, data: any): ExportFile {
        let newExportFile: ExportFile;
        switch(type) {
            case ExportFileType.PDF: 
                newExportFile =  new PdfExportFile(fileName, data);
                break;
            case ExportFileType.EXCEL:
                newExportFile = new ExcelExportFile(fileName, data);
                break;
            case ExportFileType.RTF:
                newExportFile = new RtfExportFile(fileName, data);
        }
        return newExportFile;
    }
}

window.addEventListener('load', () => {
    const factory: ExportFileFactory = new ExportFileFactory(),
                files: ExportFile[] = [];

    files.push(factory.createExportFile("audit", ExportFileType.EXCEL, "some data"));
    files.push(factory.createExportFile("presentation", ExportFileType.PDF, "some data"));
    files.push(factory.createExportFile("resume", ExportFileType.RTF, "some data"));
    files.push(factory.createExportFile("cv", ExportFileType.PDF, "some data"));
    files.push(factory.createExportFile("menu", ExportFileType.EXCEL, "some data"));

    for(let i = 0; i < files.length; ++i) {
        console.log(`${i+1}. ${files[i].fileName}.${Extension[files[i].getExtension()]} file with data: ${files[i].data}`);
    }
})