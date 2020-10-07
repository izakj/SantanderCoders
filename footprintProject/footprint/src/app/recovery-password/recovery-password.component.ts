import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-recovery-password',
  templateUrl: './recovery-password.component.html',
  styleUrls: ['./recovery-password.component.css']
})
export class RecoveryPasswordComponent implements OnInit {

  public formRecovery: FormGroup;
  public submitted: boolean = false;

  constructor(
    private fb: FormBuilder,
    private router: Router) { }


  ngOnInit(): void {
    this.iniciarFormRecovery();
  }

  recuperar() {
    this.submitted = true;
    if (this.formRecovery.invalid) {
      return;
    }
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.formRecovery.value));
    this.router.navigate(['/login']);
  }

  public iniciarFormRecovery() {
    this.formRecovery = this.fb.group({
      recoveryEmail: ['', [Validators.required, Validators.email]],
    });
    
  }


}
