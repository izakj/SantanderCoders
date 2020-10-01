import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { DashboardClientComponent } from './dashboard-client/dashboard-client.component';
import { LoginClientComponent } from './login-client/login-client.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RegisterClientComponent } from './register-client/register-client.component';
import { AboutUSComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { RecoveryPasswordComponent } from './recovery-password/recovery-password.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

// import { RegisterClientComponent } from './register-client/register-client.component';
// import { LoginClientComponent } from './login-client/login-client.component';




@NgModule({
  declarations: [
    AppComponent,
    DashboardClientComponent,
    LoginClientComponent,
    RegisterClientComponent,
    AboutUSComponent,
    ContactUsComponent,
    RecoveryPasswordComponent,
    PageNotFoundComponent,
  ],
  imports: [
    BrowserModule,
    BrowserModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }