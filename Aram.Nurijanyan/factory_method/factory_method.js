var Extension;
(function (Extension) {
    Extension[Extension["pdf"] = 0] = "pdf";
    Extension[Extension["xlsx"] = 1] = "xlsx";
    Extension[Extension["rtf"] = 2] = "rtf";
})(Extension || (Extension = {}));
var ExportFileType;
(function (ExportFileType) {
    ExportFileType[ExportFileType["PDF"] = 0] = "PDF";
    ExportFileType[ExportFileType["EXCEL"] = 1] = "EXCEL";
    ExportFileType[ExportFileType["RTF"] = 2] = "RTF";
})(ExportFileType || (ExportFileType = {}));
var PdfExportFile = /** @class */ (function () {
    function PdfExportFile(fileName, data) {
        this.fileName = fileName;
        this.data = data;
        this.fileName = fileName;
        this.data = data;
    }
    PdfExportFile.prototype.getExtension = function () {
        return Extension.pdf;
    };
    return PdfExportFile;
}());
var ExcelExportFile = /** @class */ (function () {
    function ExcelExportFile(fileName, data) {
        this.fileName = fileName;
        this.data = data;
        this.fileName = fileName;
        this.data = data;
    }
    ExcelExportFile.prototype.getExtension = function () {
        return Extension.xlsx;
    };
    return ExcelExportFile;
}());
var RtfExportFile = /** @class */ (function () {
    function RtfExportFile(fileName, data) {
        this.fileName = fileName;
        this.data = data;
        this.fileName = fileName;
        this.data = data;
    }
    RtfExportFile.prototype.getExtension = function () {
        return Extension.rtf;
    };
    return RtfExportFile;
}());
var ExportFileFactory = /** @class */ (function () {
    function ExportFileFactory() {
    }
    ExportFileFactory.prototype.createExportFile = function (fileName, type, data) {
        var newExportFile;
        switch (type) {
            case ExportFileType.PDF:
                newExportFile = new PdfExportFile(fileName, data);
                break;
            case ExportFileType.EXCEL:
                newExportFile = new ExcelExportFile(fileName, data);
                break;
            case ExportFileType.RTF:
                newExportFile = new RtfExportFile(fileName, data);
        }
        return newExportFile;
    };
    return ExportFileFactory;
}());
window.addEventListener('load', function () {
    var factory = new ExportFileFactory(), files = [];
    files.push(factory.createExportFile("audit", ExportFileType.EXCEL, "some data"));
    files.push(factory.createExportFile("presentation", ExportFileType.PDF, "some data"));
    files.push(factory.createExportFile("resume", ExportFileType.RTF, "some data"));
    files.push(factory.createExportFile("cv", ExportFileType.PDF, "some data"));
    files.push(factory.createExportFile("menu", ExportFileType.EXCEL, "some data"));
    for (var i = 0; i < files.length; ++i) {
        console.log(i + 1 + ". " + files[i].fileName + "." + Extension[files[i].getExtension()] + " file with data: " + files[i].data);
    }
});
