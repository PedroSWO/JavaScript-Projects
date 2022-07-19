const getUserChoice = userInput => {
    if (userInput === 'rock' || userInput ==='paper' || userInput=== 'scissors') {
      return userInput
    } else {
      console.log('Error')
    }
    }
    
    console.log(getUserChoice('rock'))
    
    function getComputerChoice () {
     var randomNumber = Math.floor(Math.random()*3)
      
    switch (randomNumber) {
      case 0 :
        return 'rock'
        break;
      case 1:
        return 'paper'
        break;
      case 2:
      return 'scissors'
      break;
    }
    }
    
    console.log(getComputerChoice())
    
    function determineWinner(userChoice, computerChoice) {
      if (userChoice === computerChoice) {
        return 'Game is TIE'
      }
      if (userChoice === 'rock' && computerChoice === 'paper'){
        return 'Computer WON'
      }else {
        return 'User WON'
      }
      if (userChoice === 'paper' && computerChoice === 'rock') {
        return 'User WON' 
      }else {
      return 'Computer WON'
      }
        if (userChoice === 'scissor' && computerChoice === 'paper'){
        return 'User WON' 
      }else {
      return 'Computer WON'
      }
     
    }
    
    function playGame(){
      var userChoice = getUserChoice('paper')
      var computerChoice = getComputerChoice()
      console.log(userChoice)
      console.log(computerChoice)
      console.log(determineWinner(userChoice,computerChoice))
    }
    playGame()