import { expect, test } from 'vitest'
import { interest } from '../../../main/ts/ex_recursion/interest'

test('value after two years with interest 5 and 7', () => {
    expect(interest(1000, 2000, [5, 7])).toStrictEqual( [[ 2000, 1050 ],
                                                         [ 2001, 1123.50 ]])
})
