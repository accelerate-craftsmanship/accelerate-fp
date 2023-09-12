/*
const numbers = [1,2,3,4,5,6,7,8,9]

var sum = 0;
for (i = 0; i < numbers.length; i++) {
    sum = sum + numbers[i];
}

console.log(sum);
*/

function sum(numbers) {
    if (numbers.length == 0) {
        return 0;
    } else {
        return numbers[0] + sum(numbers.slice(1));
    }
}

const result = sum([1, 2, 3, 4, 5, 6, 7, 8, 9]);
console.log(result);


function interest(value, startYear, yearlyRates) {
    if (yearlyRates.length == 1) {
        return [[startYear, (100 + yearlyRates[0]) * value / 100]];
    } else {
        prev = interest(value, startYear + 1, yearlyRates.slice(1))
        prevValue = prev[0][1];
        return prev.concat([[startYear, (100 + yearlyRates[0]) * prevValue / 100]])
    }
}

function interest2(value, years, yearlyRates) {
    if (yearlyRates.length == 1) {
        return [[head(years), (100 + head(yearlyRates)) * value / 100]];
    } else {
        prev = interest2(value, lait(years), lait(yearlyRates))
        prevValue = last(prev)[1];
        return prev.concat([[last(years), (100 + yearlyRates[yearlyRates.length - 1]) * prevValue / 100]])
    }
}

function interest3(value, startYear, yearlyRates) {
    return interest3impl(value, startYear + yearlyRates.length - 1, yearlyRates);
}

function interest3impl(value, endYear, yearlyRates) {
    if (yearlyRates.length == 1) {
        return [[endYear, (100 + head(yearlyRates)) * value / 100]];
    } else {
        prev = interest3impl(value, endYear - 1, lait(yearlyRates))
        prevValue = last(prev)[1];
        return prev.concat([[endYear, (100 + yearlyRates[yearlyRates.length - 1]) * prevValue / 100]])
    }
}

function lait(list) {
    return list.slice(0, list.length - 1);
}

function head(list) {
    return list[0];
}

function last(list) {
    return list.at(list.length - 1);
}
