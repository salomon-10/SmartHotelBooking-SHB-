#include <stdio.h>
#include <stdlib.h>

int i;
int Prime(int n){
int p=0, x=2; // n:la position désirer; x:le nbre premier actuele; p=le compteur qui poursuit le x; i:le compteur pour la verification
	while(p<x){
		int i;
		for(i=2;i<=x;i++){
			if(x%i==0){
				break;// si xest divisible alors il n'est pas premiers donc on sort 
			}}
		if(i==x){ // si x est premier alors on passe o nbre suivant
			p++;
		}
		if(p==n){// une foi le compteur "p" arrivée a la position "n" alors on a ntre niéeme nbr premier 
			printf("%d nbre premier est : %d",n,x);
			 return x;
		}
		x++; // suivannt  
	}
}
	int main(){
	int a=10001;
	Prime(a);
	return 0;
}
