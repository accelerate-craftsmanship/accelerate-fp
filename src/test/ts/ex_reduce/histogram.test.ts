import { expect, test } from 'vitest'
import { histogram } from '../../../main/ts/ex_reduce/histogram'

test('histogram of 48, 23, 1, 43, 73, 99', () => {
    expect(histogram([48, 23, 1, 43, 73, 99])).toStrictEqual([1, 0, 1, 0, 2, 0, 0, 1, 0, 1]);
})


/*
Alternative: using a map for the result, instead of list.

test('histogram of 48, 23, 1, 43, 73, 99', () => {
    expect(histogram([48, 23, 1, 43, 73, 99])).toStrictEqual({
         '1-10': 1,
         '11-20': 0,
         '21-30': 1,
         '31-40': 0,
         '41-50': 2,
         '51-60': 0,
         '61-70': 0,
         '71-80': 1,
         '81-90': 0,
         '91-100': 1,
         });
})
*/
