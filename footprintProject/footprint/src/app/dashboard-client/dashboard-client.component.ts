import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';
import { NgbPaginationModule, NgbAlertModule } from '@ng-bootstrap/ng-bootstrap';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { Chart } from 'chart.js';
// import {NgbdDropdownManualModule} from './app/dropdown-manual.module';


@Component({
  selector: 'app-dashboard-client',
  templateUrl: './dashboard-client.component.html',
  styleUrls: ['./dashboard-client.component.css']
})

export class DashboardClientComponent implements OnInit {
  classContents = ["historic", "update", "tips", "configurations", "adm"]
  classTips = ["cat1", "cat2", "cat3", "cat4", "cat5"]
  numberQuestion = 0
  numberTotalQuestion = 0
  questionsChecked = []
  
  constructor() { }
  
  ngOnInit(): void {
    this.hiddenContent();
    this.showContent('historic')
    this.hiddenContentCategories()
    this.insertChart()
    
  }
  
  insertChart(){
    
    var myChart = new Chart('canvas', {
        type: 'bar',
        data: {
            labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
            datasets: [{
                label: '# of Votes',
                data: [12, 19, 3, 5, 2, 3],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)'
                ],
                borderColor: [
                    'rgba(255, 000, 000, 000)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
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
