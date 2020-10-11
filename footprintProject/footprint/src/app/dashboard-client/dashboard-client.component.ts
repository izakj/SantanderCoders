import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';
import { NgbPaginationModule, NgbAlertModule } from '@ng-bootstrap/ng-bootstrap';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { Chart } from 'chart.js';
import { ClientServiceService } from './../client-service.service';
// import {NgbdDropdownManualModule} from './app/dropdown-manual.module';

@Component({
  selector: 'app-dashboard-client',
  templateUrl: './dashboard-client.component.html',
  styleUrls: ['./dashboard-client.component.css']
})

export class DashboardClientComponent implements OnInit {
  classContents = ["historic", "update", "tips", "configurations", "adm"];
  classTips = ["cat1", "cat2", "cat3", "cat4", "cat5"];
  registerQuestion = {id: '', title: '', answerA: '', weightA: '', answerB: '', weightB: '', answerC: '', weightC: '', answerD: '', weightD: '', statusQuestion: '', categoryQuestion: ''};
  numberQuestion = 0;
  numberTotalQuestion = 0;
  questionsChecked = [];
  allQuestions;
  teste = '';
  
  constructor( private clientService: ClientServiceService ) { }
  
  ngOnInit(): void {
    this.hiddenContent();
    this.showContent('historic')
    this.hiddenContentCategories()
    this.insertChart()
    // this.getAllQuestions()

  }

  // getAllQuestions()
  // {
  //   this.clientService.toList().subscribe(response =>
  //       this.allQuestions = response
  //   );
  // }

  // Chart Draw
  insertChart(){
    
    var myChart = new Chart('canvas', {
      type: 'bar',
      data: {
        labels: ['Janeiro', 'Fevereiro', 'Março','Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'],
        datasets: [
          {
            label: 'Alojamento',
            data: [5, 2, 5, 1, 3, 1, 0.25, 4, 9, 7, 3, 2],
            backgroundColor: '#F94144',
          },
          {
            label: 'Alimentação',
            data: [7, 0.25, 3, 4, 0.25, 2, 0.25, 1, 1, 1, 2, 3],
            backgroundColor: '#F3722C',
          },
          {
            label: 'Transporte',
            data: [1, 2, 8, 1, 0.1, 0.25, 0.25, 0.25, 0.5, 2, 3, 3],
            backgroundColor: '#F9C74F',
          },
          {
            label: 'Consumo',
            data: [0.75, 2, 2, 3, 3, 0.75, 0.75, 4, 2, 2, 1, 4],
            backgroundColor: '#90BE6D',
          },
          {
            label: 'Resíduos',
            data: [2, 0.5, 3.5, 4, 5, 0.1, 0.5, 4.5, 4, 2, 5, 1],
            backgroundColor: '#577590',
          }
        ]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          xAxes: [{ 
                    stacked: true,
                    scaleLabel:{
                      display: true,
                      labelString: "Mês" 
                    },
                    gridLines:{
                      display: false
                    }
                  }],
          yAxes: [{ 
                    stacked: true,
                    scaleLabel:{
                      display: true,
                      labelString: "Hectares Globais (gha)"
                    },
                    gridLines:{
                      display: false
                    }
                  }]
        }
      }
    });
  }

  // Hide Content Buttons Menu 
  hiddenContent(){
      this.classContents.forEach(iten => {
          $('.row.'+iten).hide()
      })
  }

  // Show Content Buttons Menu
  showContent(nameRowToShow){
    this.hiddenContent()
    $('.row.'+nameRowToShow).show()
  }
  
  // Hide Content Categories
  hiddenContentCategories(){
      this.classTips.forEach(iten => {
          $('.row.'+iten).hide()
      })

  }
  
  //Show Content Dropdown
  showContentTips(tipCategory){
    this.hiddenContentCategories()
    $('.row.'+tipCategory).show()
  }

  analyzeQuestions(form){
    this.numberTotalQuestion = $('.questionToAnalyze').length
    this.questionAnalyze()
    console.log(this.questionsChecked)
  } 
  
  insertQuestion(form)
  {

    let titleInput = $('#question').val()
    let answerAinput = $('#answerA').val()
    let weightAinput = $('#answerWeightA').val()
    let answerBinput = $('#answerB').val()
    let weightBinput = $('#answerWeightB').val()
    let answerCinput = $('#answerC').val()
    let weightCinput = $('#answerWeightC').val()
    let answerDinput = $('#answerD').val()
    let weightDinput = $('#answerWeightD').val()
    let statusInput = $('#selectStatusQuestion').val()
    let categoryInput = $('#selectCategory').val()

    this.registerQuestion = {
      id:  '',
      title: '' + titleInput,
      answerA: '' + answerAinput,
      weightA: ''+ weightAinput,
      answerB: '' + answerBinput,
      weightB: ''+ weightBinput,
      answerC: '' + answerCinput,
      weightC: ''+ weightCinput,
      answerD: '' + answerDinput,
      weightD: '' + weightDinput,
      statusQuestion: '' + statusInput,
      categoryQuestion: '' + categoryInput 

    } 
 
    // this.questionsService.toAdd(this.registerQuestion).subscribe(() => {
    //   this.registerQuestion = {id: '', title: '', questionA: '' };
    // });

     console.log(this.registerQuestion)
    // console.log(form)
    // console.log(statusInput)
  }
    
  // To analyze the alternatives choose of the questions
  questionAnalyze ()//question component selected by class 
  {
      let questionOptions = {
          number: 0,
          letter: ''
      }
      
      if (this.numberQuestion > this.numberTotalQuestion)
      {
          return
      }

      this.numberQuestion++
      let question = $(".question"+this.numberQuestion)

      for (let i = 0; i < question.length; i++)
      {

        let stateCurrent = question[i]['checked']
        
        if (stateCurrent)
        {
          
          let letterChoose = question[i].id.substring(0,1)
          questionOptions.number = this.numberQuestion
          questionOptions.letter = letterChoose
          this.questionsChecked.push(questionOptions);

        }
      }

      this.questionAnalyze()
  }

}
