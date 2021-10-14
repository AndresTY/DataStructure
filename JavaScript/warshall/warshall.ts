class warshall{
	matriz:number [][];
	tamM:number;

	leer(){
		this.tamM =Number(prompt("matrix lenght"));
		this.matriz= new Array(this.tamM);
		for( var i=0; i< this.matriz.length-1; i++){
			this.matriz[i] = new Array(this.tamM);
		}
		for( var i=1; i<= this.tamM;i++){
			for( var j=1; j<= this.tamM;j++){
				this.tamM[i][j]=0;
			}
		}
		var adjunto:number;
		for( var i=1;i<=this.tamM;i++){
			adjunto = Number(prompt(`vertice de ${i}`));
			while(adjunto != 99){
				this.matriz[i][adjunto]=1;
				adjunto = Number(prompt(`vertice de ${i}`));
			}
		}
	}

	printt(){
		this.matriz.forEach((a)=> console.log(a));
	}

	warshall(){
		for(var k=1;k<= this.tamM;k++){
			for( var i=1;i<=this.tamM;i++){
				if(i!=k){
					if(this.matriz[i][k] == 1){
						for( var j=1; j<=this.tamM;j++){
							if(this.matriz[i][j]==0){
								this.matriz[i][j]=this.matriz[k][j];
							}
						}
					}
				}
			}
		}
		this.printt();
	}

	conectt():Boolean{
		var estado:boolean = true
		for (var i=1; i<=this.tamM;i++) {
			for(var j=1; j<=this.tamM;i++){
				if(this.matriz[i][j]==0){
					estado=false;
					return estado;
				}
			}
		}
		return estado
	}
}
	
var war = new warshall();
war.leer();
war.printt();
war.warshall();
				
