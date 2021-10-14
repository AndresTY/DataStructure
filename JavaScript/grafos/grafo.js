/**
 * no tiene inputs debido a que estas son pormedio de html
 **/
var Grafo = /** @class */ (function () {
    function Grafo(Vertices) {
        this.Num_vertices = Vertices;
        this.grafo = [];
    }
    Grafo.prototype.insertA = function (v1, v2, peso) {
        this.grafo.push(peso, [v1, v2]);
    };
    Grafo.prototype.existA = function (v1, v2) {
        this.grafo.some(function (a) { return [v1, v2] == a ? console.log(true) : console.log(false); });
    };
    Grafo.prototype.obtenerP = function (v1, v2) {
        this.grafo.forEach(function (a) { return a.valueOf() == [v1, v2] ? console.log(a) : null; });
    };
    Grafo.prototype.deleteA = function (v1, v2) {
        this.grafo.splice(this.grafo.indexOf([v1, v2]), 1);
    };
    Grafo.prototype.liberarG = function () {
        this.grafo = null;
    };
    Grafo.prototype.printG = function () {
        this.grafo.forEach(function (a) { return console.log(a); });
    };
    Grafo.prototype.ady = function (v) {
        this.grafo.forEach(function (a, b) { return a == [v, b] || [b, v] ? console.log(true) : console.log(false); });
    };
    Grafo.prototype.primero = function (v) {
        this.grafo.forEach(function (a, b) { return a == [v, b + 1] || a == [b + 1, v] ? console.log(a) : null; });
    };
    Grafo.prototype.otros = function (v, v2) {
        this.grafo.forEach(function (a) { return a == [v, v2 + 1] ? console.log(a) : null; });
    };
    return Grafo;
}());
var operaciones = /** @class */ (function () {
    function operaciones() {
        this.graf = new Grafo(20);
    }
    operaciones.prototype.agregar = function (v1, v2, peso) {
        this.graf.insertA(v1, v2, peso);
    };
    operaciones.prototype.borra = function (v1, v2) {
        this.graf.deleteA(v1, v2);
    };
    operaciones.prototype.delgraf = function () {
        this.graf.liberarG();
    };
    operaciones.prototype.printgraf = function () {
        this.graf.printG();
    };
    return operaciones;
}());
var app = /** @class */ (function () {
    function app() {
        this.ope = new operaciones();
    }
    app.prototype.procda = function () {
        /**
         *procesar
         */
    };
    app.prototype.imprmirmenu = function () {
        /**
         *console.log("Menu");
         *all options
         **/
    };
    app.prototype.anexA = function () {
        /**
         * a=input
         * b=input
         * this.ope.agregar(a,b);
         **/
    };
    app.prototype.borrarA = function () {
        /**
         * a=input
         * b=input
         * this.ope.borra(a,b);
         **/
    };
    app.prototype.borrarGra = function () {
        this.ope.delgraf();
    };
    app.prototype.imprimirgra = function () {
        this.ope.printgraf();
    };
    return app;
}());
