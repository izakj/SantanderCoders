import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardClientComponent } from './dashboard-client/dashboard-client.component';
import { LoginClientComponent } from './login-client/login-client.component';
// import { CommonModule } from '@angular/common';
// import { RegisterClientComponent } from './register-client/register-client.component';
// import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


const routes: Routes = [
  {path: '', redirectTo:'login', pathMatch: 'full'},
  {path: 'dashboard', component: DashboardClientComponent},
  {path: 'login', component: LoginClientComponent},
  // {path: "**", component: PageNotFoundComponent}
] 

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }




