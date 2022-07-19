function getSleepHours(day){
    switch (day){
      case 'Monday':
      return 8
      break;
      case 'Tuesday':
      return 6
      break;
      case 'Wednesday':
      return 8
      break;
      case 'Thursday':
      return 7
      break;
      case 'Friday':
      return 5
      break;
      case 'Saturday':
      return 6
      break;
      case 'Sunday':
      return 10
      break;
    }
  }
  console.log(getSleepHours('Sunday'))
  
  function getActualSleepHours() {
  return getSleepHours('Monday') + getSleepHours('Tuesday') + getSleepHours('Wednesday') + getSleepHours('Thursday') + getSleepHours('Friday') + getSleepHours('Saturday') + getSleepHours('Sunday')
  }
  
  function getIdealSleepHours() {
    const idealHours = 8
    return idealHours * 7
  }
  console.log(getActualSleepHours())
  console.log(getIdealSleepHours())
  
  function calculateSleepDebt() {
    const actualSleepHours = getActualSleepHours()
    const idealSleepHours = getIdealSleepHours()
  
  if (actualSleepHours === idealSleepHours){
    console.log ('You got ' + (idealSleepHours - actualSleepHours) + ' perfect amount of  hour(s) sleep.')
    }
  
  if (actualSleepHours > idealSleepHours) {
    console.log('You got ' + (idealSleepHours - actualSleepHours) + ' hour(s) more sleep than you needed this week.')
  }
  
  if (actualSleepHours < idealSleepHours) {
    console.log('You got ' + (idealSleepHours - actualSleepHours) + ' hour(s) less sleep than you needed this week. Get some rest.')
  }
  }
  console.log(calculateSleepDebt())