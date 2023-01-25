import { Component, OnInit } from '@angular/core';
import { categorie } from '../entity/categorie';
import { Produit } from '../entity/produit';
import { ProduitserviceService } from '../service/produitservice.service';

@Component({
  selector: 'app-produit',
  templateUrl: './produit.component.html',
  styleUrls: ['./produit.component.css']
})
export class ProduitComponent implements OnInit {

  
  categories?: categorie[];
  produits?: Produit[];

  selectedCategorie="";


  constructor( private ps: ProduitserviceService ) { }

  ngOnInit(): void {
    this.ps.getAllCategorie().subscribe(data=>{
 
      
      this.categories=data;
    })
  }
  getProduit(categoriename:string) {
    
    this.ps.getProduitByc(categoriename).subscribe(data=>{
      console.log(data);
      this.produits=data;
    }

    )
   
    }
   

}
