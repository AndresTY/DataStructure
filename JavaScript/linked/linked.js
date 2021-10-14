var Estudiantes = /** @class */ (function () {
    function Estudiantes(_id, _name, _lastname) {
        this.id = _id;
        this.name = _name;
        this.lastname = _lastname;
    }
    Object.defineProperty(Estudiantes.prototype, "Id", {
        get: function () {
            return this.id;
        },
        set: function (value) {
            this.id = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Estudiantes.prototype, "Name", {
        get: function () {
            return this.name;
        },
        set: function (value) {
            this.name = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Estudiantes.prototype, "Lastname", {
        get: function () {
            return this.lastname;
        },
        set: function (value) {
            this.lastname = value;
        },
        enumerable: false,
        configurable: true
    });
    Estudiantes.prototype.toString = function () {
        return this.id + " " + this.name + " " + this.lastname;
    };
    return Estudiantes;
}());
var Coleccion = /** @class */ (function () {
    function Coleccion() {
        this.coleccion = [];
    }
    Coleccion.prototype.insertStudent = function (student) {
        this.coleccion.push(student);
    };
    Coleccion.prototype.insertFirst = function (student) {
        this.coleccion.unshift(student);
    };
    Coleccion.prototype.getFirst = function () {
        console.log(this.coleccion[0]);
    };
    Coleccion.prototype.getLast = function () {
        console.log((this.coleccion[this.coleccion.length - 1]));
    };
    Coleccion.prototype.removeFirst = function () {
        this.coleccion.shift();
    };
    Coleccion.prototype.removeLast = function () {
        this.coleccion.pop();
    };
    Coleccion.prototype.removeInfo = function (index) {
        this.coleccion.splice(index, 1);
    };
    Coleccion.prototype.showInfo = function () {
        console.log(this.coleccion);
    };
    Coleccion.prototype.printInfo = function () {
        this.coleccion.forEach(function (element) { return console.log(element); });
    };
    Coleccion.prototype.updateInfo = function (index, student) {
        this.coleccion.splice(index, 0, student);
    };
    return Coleccion;
}());
var test = /** @class */ (function () {
    function test() {
        this.mc = new Coleccion();
    }
    test.prototype.startInfo = function () {
        this.mc.insertFirst(new Estudiantes("123", "Andres", "Ducuara"));
        this.mc.insertFirst(new Estudiantes("456", "Santigo", "Velasquez"));
        this.mc.insertFirst(new Estudiantes("789", "amarillo", "azul"));
        this.mc.printInfo();
        this.mc.getFirst();
        this.mc.getLast();
        this.mc.removeInfo(2);
        this.mc.showInfo();
    };
    return test;
}());
var tc = new test();
tc.startInfo();
