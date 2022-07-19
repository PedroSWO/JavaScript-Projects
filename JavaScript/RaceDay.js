let raceNumber = Math.floor(Math.random() * 1000);
const registeredEarly = false
const runnerAge = 17

if (runnerAge >= 18 && registeredEarly) {
  raceNumber += 1000
}

if (runnerAge >= 18 && registeredEarly) {
  console.log(`You will race at 9:30 am, with number: ${raceNumber}`)
}else if (runnerAge >= 18 && !registeredEarly){
  console.log(`You will race at 11:00 am, with number: ${raceNumber}`)
}else if (runnerAge < 18){
  console.log (`You will race at 12:30 pm, with number: ${raceNumber}`)
}else {
  console.log('See the registration desk')
}

