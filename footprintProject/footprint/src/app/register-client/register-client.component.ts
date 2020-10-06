import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register-client',
  templateUrl: './register-client.component.html',
  styleUrls: ['./register-client.component.css']
})
export class RegisterClientComponent implements OnInit {

  public formulario: FormGroup;
  public submitted: boolean = false;

  constructor(
    private fb: FormBuilder) { }


  ngOnInit(): void {
    this.iniciarFormulario();
  }

  cadastrar() {
    this.submitted = true;
    if (this.formulario.invalid) {
      return;
    }
    // this.salvar();
  };

  public iniciarFormulario() {
    this.formulario = this.fb.group({
      id: [null],
      inputName: ['', Validators.required],
      inputSurname: ['', Validators.required],
      inputEmail: ['', [Validators.required, Validators.email]],
      inputPassword: ['', Validators.required],
    });
    
  }



}
