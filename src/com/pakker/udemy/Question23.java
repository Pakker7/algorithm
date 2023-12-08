package com.pakker.udemy;

// https://wjtb.udemy.com/course/comgong_codingtest/learn/lecture/29145944#overview

//이진 탐색 (Binary Search)
//- 탐색 전에 반드시 <정렬>되어 있어야 한다. -> 정렬이 안되어 있으면 정렬 후에 진행한다.
//- 살펴보는 범위를 절반씩 <줄여가면서> 답을 찾는다.
//
//ex. 1차원 배열에서 값을 찾는 행위를 해야되는데
//--> 한번만 해야된다. 하면 선형탐색이 유리함
//--> 여러번 찾아야 된다. 하면 이진 탐색이 유리함
//
//파라메트릭 서치(Parameteric search)
//- 최적화 문제를 결정 문제로 바꿔서 이진탐색으로푸는 방법이다.
//- 최적화 문제 : 문제 상황을 만족하는 변수의 최소값, 최대값을 구하는 문제
//- 결정 문제 : Yes / No problem
//
//- 매개 변수 parameter가 주어지면 true or false가 결정 되어야 한다.
//- 가능한 해의 영역이 연속적이여야 한다.
//- 범위를 반씩 줄여가면서 가운데 값이 true인지 false 인지 구한다.
//- 이진 탐색과 같은 원리
//
//ex. 유데미 수강생들의 외모 값과 커플/솔로 여부가 주어진다.
//커플들은 솔로보다 외모값이 높다.
//외모 값이 최소 몇 이상일 때부터 커플인가?
//--> 선형탐색 : 순서대로 커플과 외모값을 보고서 찾아낸다.
//--> 이진탐색 : 중간에서 탐색하며 맞춘다.

//https://www.acmicpc.net/problem/2512
public class Question23 {


}
