import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProduitComponent } from './produit/produit.component';

const routes: Routes = [
  { path: "produit", component: ProduitComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
