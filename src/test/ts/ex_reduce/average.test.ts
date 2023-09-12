import { expect, test } from 'vitest'
import { average } from '../../../main/ts/ex_reduce/average'

test('average of 3, 7 and 11 is 7', () => {
    expect(average([3, 7, 11])).toBe(7)
})

test('average of one number is itself', () => {
    expect(average([8])).toBe(8)
})