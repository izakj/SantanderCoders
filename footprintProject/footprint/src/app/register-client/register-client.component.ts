import { ClientServiceService } from './../client-service.service';
// import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MustMatch } from '../_helpers/must-match.validator';

@Component({
  selector: 'app-register-client',
  templateUrl: './register-client.component.html',
  styleUrls: ['./register-client.component.css'],
})

export class RegisterClientComponent implements OnInit {
  
  public formRegister: FormGroup;
  public submitted: boolean = false;
  scredules = []
  operation = true
  client = {id: '', name: '', surname: '', mail: '',password: '' };
  
  ngOnInit(): void {
    this.startForm();
  }

  constructor(
    private fb: FormBuilder,
    // private router: Router,
    private clientService: ClientServiceService) { }

  public startForm() {

    this.formRegister = this.fb.group({

      id: [null],
      inputName: ['', Validators.required],
      inputSurname: ['', Validators.required],
      inputEmail: ['', [Validators.required, Validators.email]],
      inputPassword: ['', Validators.required],
      inputConfirm: ['', Validators.required]
    }, {

        validator: MustMatch('inputPassword', 'inputConfirm')
    });
    
  }

  registerClient(formRegister){
    this.client = {
      id: '', 
      name: formRegister.value.inputName,
      surname: formRegister.value.inputSurname,
      mail: formRegister.value.inputEmail,
      password: formRegister.value.inputPassword
    };
   
    
    this.clientService.toAdd(this.client).subscribe(() => {
      this.client = {id: '', name: '', surname: '', mail: '',password: '' };
    });
  }

 
}


