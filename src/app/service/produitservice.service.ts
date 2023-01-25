import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { categorie } from '../entity/categorie';
import { Produit } from '../entity/produit';
@Injectable({
  providedIn: 'root'
})

export class ProduitserviceService {
    environment = {
    production: false,
    apiUrl: 'http://localhost:8089/'
  };
  
  constructor(private http: HttpClient) { }
  getAllCategorie() {
    return this.http.get<categorie[]>(`${this.environment.apiUrl}/Produit/getcategorie`);
  }
  getProduitByc(categoriename:String){
    return this.http.get<Produit[]>(`${this.environment.apiUrl}/Produit/getproduit/`+categoriename);
  }
}
