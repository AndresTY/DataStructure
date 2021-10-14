var prim = /** @class */ (function () {
    function prim(_nPrim) {
        this.marcados = [];
        this.mins = [];
        this.padres = [];
        this.mPrim = _nPrim;
        this.suma = 0;
    }
    prim.prototype.iniciar = function () {
        for (var _i = 0, _n = this.mPrim; _i < _n.length; _i++) {
            this.marcados[_i] = 0;
            this.mins[_i] = _n[0][_i];
            this.padres[_i] = 1;
        }
        console.log("******************************");
    };
    prim.prototype.captura = function () {
        this.iniciar();
        this.mins[1] = 0;
        this.padres[1] = 0;
        this.marcados[1] = 1;
        for (var k = 0, _nPrim = this.mPrim; k < _nPrim.length; k++) {
            var esc = this.buscar();
            this.marcados[esc] = 1;
            for (var j = 0; j < _nPrim.length; j++) {
                if (this.marcados[j] == 0 && this.mPrim[esc][j] < this.mins[j]) {
                    this.mins[j] = this.mPrim[esc][j];
                    this.padres[j] = esc;
                }
                console.log("j: " + j);
            }
            console.log("k: " + k);
        }
        console.log("la suma es " + this.suma);
    };
    prim.prototype.buscar = function () {
        var _this = this;
        var min = 200;
        var esc = 0;
        for (var i = 0, _nprim = this.mPrim; i < _nprim.length; i++) {
            if (this.marcados[i] == 0 && this.mins[i] < min) {
                min = this.mins[i];
                console.log("min:  " + min);
                esc = i;
            }
        }
        this.mins.forEach(function (a) { return _this.suma += a; });
        console.log(this.mins);
        console.log("suma " + this.suma);
        console.log("escogido: " + esc);
        return esc;
    };
    prim.prototype.listar = function () {
        console.log(this.mPrim);
        //this.mPrim.forEach((a)=> a.forEach((b)=> console.log(b)));
    };
    return prim;
}());
var matrix = [[0, 4, 3, 0, 1],
    [4, 0, 0, 7, 0],
    [3, 0, 0, 5, 0],
    [0, 7, 5, 0, 0],
    [1, 0, 0, 0, 0]];
var temp = new prim(matrix);
temp.listar();
temp.captura();
