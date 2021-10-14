var ArrayList = /** @class */ (function () {
    function ArrayList() {
        this.list = [];
    }
    ArrayList.prototype.addInfo = function (str) {
        this.list.push(str);
    };
    ArrayList.prototype.printInfo = function () {
        console.log(this.list);
    };
    ArrayList.prototype.removeInfo = function (index) {
        this.list.slice(index, 1);
    };
    ArrayList.prototype.showList = function () {
        this.list.forEach(function (element) { return console.log(element); });
    };
    ArrayList.prototype.modifyInfo = function (index, str) {
        this.list.splice(index, 1, str);
    };
    return ArrayList;
}());
var test = /** @class */ (function () {
    function test() {
        this.ej = new ArrayList();
        this.tecnologia = ["IoT", "Ciberseguridad", "Big Data", "Industria 4.0", "IA", "SDN"];
    }
    test.prototype.copyInfo = function () {
        var _this = this;
        this.tecnologia.forEach(function (element) { return _this.ej.addInfo(element); });
    };
    test.prototype.activity = function () {
        this.copyInfo();
        this.ej.printInfo();
        this.ej.removeInfo(5);
        this.ej.showList();
        this.ej.modifyInfo(4, "Inteligencia Artificial");
        this.ej.showList();
    };
    return test;
}());
var demo = new test();
demo.activity();
