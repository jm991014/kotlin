fun main() {
	val input = readLine()!!.toInt()
	if(input % 4 == 0 && input % 100 != 0) {
		print("1");
	}
	else if (input % 400 == 0) {
		print("1");
	}
	else {
		print("0");
	}
}
