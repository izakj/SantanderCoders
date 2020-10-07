import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';
import { NgbPaginationModule, NgbAlertModule } from '@ng-bootstrap/ng-bootstrap';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-client',
  templateUrl: './login-client.component.html',
  styleUrls: ['./login-client.component.css']
})
export class LoginClientComponent implements OnInit {

  public formLogin: FormGroup;
  public submitted: boolean = false;

  constructor(
    private fb: FormBuilder,
    private router: Router) { }


  ngOnInit(): void {
    this.iniciarFormLogin();
  }

  entrar() {
    this.submitted = true;
    if (this.formLogin.invalid) {
      return;
    }
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.formLogin.value));
    this.router.navigate(['/dashboard']);
  }

  public iniciarFormLogin() {
    this.formLogin = this.fb.group({
      loginEmail: ['', [Validators.required, Validators.email]],
      loginPassword: ['', Validators.required],
    });
    
  }

}
