$(document).ready(function(){

    var classContents = ["historic", "update", "tips", "configurations", "adm"]
    var classTips = ["cat1", "cat2", "cat3", "cat4", "cat5"]
    var numberQuestion = 0
    var numberTotalQuestion = 0
    var questionsChecked = []

    // Show Content Buttons Menu
    function showContent(nameRowToShow){
        $('.row.'+nameRowToShow).show()
    }

    // Hide Content Buttons Menu 
    function hiddenContent(){
        classContents.forEach(iten => {
            $('.row.'+iten).hide()
        })
    }

    // Show Content Categories
    function showContentCategories(nameRowToShow){
        $('.row.'+nameRowToShow).show()
    }

    // Hide Content Categories
    function hiddenContentCategories(){
        classTips.forEach(iten => {
            $('.row.'+iten).hide()
        })

    }

    // To analyze the alternatives choose of the questions
    function questionAnalyze ()//question component selected by class 
    {
        let questionOptions = {
            number: 0,
            letter: ''
        }
        
        if (numberQuestion > numberTotalQuestion)
        {
            return
        }

        numberQuestion++
        let question = $(".question"+numberQuestion)

        for (let i = 0; i < question.length; i++)
        {
            let stateCurrent = question[i].checked
            if (stateCurrent)
            {
           
                let letterChoose = question[i].id.substring(0,1)
                questionOptions.number = numberQuestion
                questionOptions.letter = letterChoose
                questionsChecked.push(questionOptions);

            }
        }

        questionAnalyze()
    }
   
    $('.historic').click(function(element){
        hiddenContent()
        showContent('historic')
    })

    $('.update').click(function(element){
        hiddenContent()
        showContent('update')
    })

    $('.tips').click(function(element){
        hiddenContent()
        showContent('tips')
    })

    $('.configurations').click(function(element){
        hiddenContent()
        showContent('configurations')
    })

    $('.adm').click(function(element){
        hiddenContent()
        showContent('adm')
    })

    $('.dropdown-item.cat1').click(function(element){
        hiddenContentCategories()
        showContentCategories('cat1')
        
    })

    $('.dropdown-item.cat2').click(function(element){
        hiddenContentCategories()
        showContentCategories('cat2')
        
    })

    $('.dropdown-item.cat3').click(function(element){
        hiddenContentCategories()
        showContentCategories('cat3')
        
    })
    
    $('.dropdown-item.cat4').click(function(element){
        hiddenContentCategories()
        showContentCategories('cat4')
        
    })

    $('.dropdown-item.cat5').click(function(element){
        hiddenContentCategories()
        showContentCategories('cat5')
        
    })
 
    $('.btnDeleteQuestion').on('click', function(e){
        let descriptionquestion = $(this).data('descriptionquestion')
        let idquestion = $(this).data('idquestion')
        $('#idQuestionDelete').val(idquestion)
        $('#descriptionDelete').html(descriptionquestion)
        $('#modalConfirmDeleteQuestion').modal('show')
    })

    $('.efectDeleteQuestion').on('click', function(){
        let idQuestionDelete = $('#idQuestionDelete').val()
        console.log('(AJAX) Você só precisa excluir esse ID da Pergunta: ',idQuestionDelete)
    })

    $('.btnUpdateQuestion').on('click', function(e){
        let idquestionupdate = $(this).data('idquestionupdate')
        let descriptionQuestion = $(this).data('descriptionquestionupdate')
        $('#question').val(descriptionQuestion)
    })

    $('.formAnlyzeQuetions').on('submit', function(e){
        e.preventDefault()   
        numberTotalQuestion = $('.questionToAnalyze').length
        questionAnalyze()
        
        // NAIONARA, UTILIZAR O ARRAYS DE OBJETOS 'questionsChecked' QUE CONTEM O NUMERO DA QUESTAO E A ALTERNATIVA ESCOLHIDA 
        console.log(questionsChecked) 

    })

    $('.form-configurations').on('submit', function(e){
        e.preventDefault()
        let mail = $('#mail').val()
        let oldPassword = $('#passwordOld').val()
        let newPassword = $('#passwordNew').val()
        let confirmNewPassword = $('#newPasswordConfirm').val()
        
        let newUserSettings = {
            user: mail,
            oldPassword,
            newPassword,
            confirmNewPassword
        }
        
        // NAIONARA, UTILIZAR O ARRAY DE OBJETO 'newUserSettings' QUE CONTEM O USUARIO, A SENHA ANTIGA E A NOVA SENHA PARA ALTERAR
        console.log(newUserSettings)

    })


   
    hiddenContentCategories()
    hiddenContent()
    showContent('historic')
})