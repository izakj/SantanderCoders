import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';
import { NgbPaginationModule, NgbAlertModule } from '@ng-bootstrap/ng-bootstrap';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MustMatch } from '../_helpers/must-match.validator';

@Component({
  selector: 'app-login-client',
  templateUrl: './login-client.component.html',
  styleUrls: ['./login-client.component.css']
})
export class LoginClientComponent implements OnInit {

  public formLogin: FormGroup;
  public submitted: boolean = false;

  constructor(
    private fb: FormBuilder) { }


  ngOnInit(): void {
    this.iniciarFormLogin();
  }

  entrar() {
    this.submitted = true;
    if (this.formLogin.invalid) {
      return;
    }
    // this.salvar();
  };

  public iniciarFormLogin() {
    this.formLogin = this.fb.group({
      inputEmail: ['', [Validators.required, Validators.email]],
      inputPassword: ['', Validators.required],
    });
    
  }

}
