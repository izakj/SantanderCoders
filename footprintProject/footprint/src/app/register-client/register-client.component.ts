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
      inputConfirm: ['', Validators.required]
    }, {
        validator: MustMatch('inputPassword', 'inputConfirm')
    });
    
  }

}

export function MustMatch(controlName: string, matchingControlName: string) {
  return (formGroup: FormGroup) => {
      const control = formGroup.controls[controlName];
      const matchingControl = formGroup.controls[matchingControlName];

      if (matchingControl.errors && !matchingControl.errors.mustMatch) {
          // return if another validator has already found an error on the matchingControl
          return;
      }

      // set error on matchingControl if validation fails
      if (control.value !== matchingControl.value) {
          matchingControl.setErrors({ mustMatch: true });
      } else {
          matchingControl.setErrors(null);
      }
  }
}


