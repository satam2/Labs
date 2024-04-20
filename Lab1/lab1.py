class lab1():
    def findSum(self, array:list, target:int):
        for i in range(len(array)):
            for j in range(len(array)):
                if(i!=j and array[i]+array[j] == target):
                    return "indices "+str(i)+" and "+str(j)+" add up to "+str(target)
        return

# test = lab1()
# arr = []
# print(test.findSum(arr, 10))
