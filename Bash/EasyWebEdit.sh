#!/bin/bash

# # # # # # # # # # # # # # # # # # # # # #
#     Welcome To Easy Web Edit [EWE]      #
# # # # # # # # # # # # # # # # # # # # # #
# This script is a friendly editing tool  #
# It will help you make changes to files  #
# Designed purely for editing web files   #
# EWE is powerful, simple, & easy to use  #
# # # # # # # # # # # # # # # # # # # # # #
# Give the script no arguments and it     #
#     will guide you on how to use it     #
# Give 2 arguments and it will replace    #
#     all occurances of arg1 with arg2    #
# # # # # # # # # # # # # # # # # # # # # #

## This function replaces all instances of arg1 with arg2 in all files
replace_all() {

	# Prints action to terminal and tells user what's about to happen
	echo "All Occurances Of '$1' Will Be Replaced With '$2'"
	
	# Asks user if they'd like to proceed
	echo -n "Would You Like To Proceed? (Y/N)==> "
	
	# Stores user input into variable
	read quick_input

	#Converts user input into lower case; sanitizes input
	quick_input_lower=`echo $quick_input | tr "[:upper:]" "[:lower:]"`
	
	# Prints a newline to the termianl
	echo ""

	# If user input is a lowercase or uppercase 'y', then
	if [ $quick_input_lower == "y" ] || [ $quick_input_lower == "yes" ]
	then 
		# Iterate through all files in the current directory
		for i in $(ls) 
		do
			if 
				# If a file contains 'arg1', then
				grep -q "$1" "$i" 
			then 
				# Notify user that text is found and in what file
				echo -n "Text Found: YES || File: $i "

				# Replace 'arg1' with 'arg2' in current file
				sed -i '' "s/$1/$2/g" "$i"

				# Test SED exit code to make sure operation was successful
				if [ $? -eq 0 ]
				then
					# Exit Code 0 is a success
					echo "|| SUCCESS"
				else
					# Anything but 0 is a fail
					echo "|| FAILED"
				fi
			else 
				# If file does not contain 'arg1', then print result to terminal
				echo "Text Found: NO  || File: $i"
			fi
		done
	# If user input is a lowercase or uppercase 'n', then
	elif [ $quick_input_lower == "n" ] || [ $quick_input_lower == "no" ]
	then
		# Tell user that nothing was replaced
		echo "No Text Was Replaced. Thank You For Using EWE!"
	else
		# If input was neither 'y' or 'n', then ask user to try again
		echo "I'm Sorry, I Don't Know That. Please Try Again."
	fi
}

## This function prints the final message to console
ending_message() {

	# Print border and a polite message to console
	echo -e "\n---------------------------"
	echo "| Thank You For Using EWE |"
	echo "|     Have A Nice Day     |"
	echo -e "---------------------------\n"
	exit
}

## This function prints a menu with options that tell the user what can be done
print_menu() {

	echo -e "\n~~~~~~~~~~~~~~~~~"
	echo "~ Easy Web Edit ~"
	echo "~~~~~~~~~~~~~~~~~"
	echo "1. List All Files" 	# List all files in the directory in a simple or advanced view
	echo "2. Search For Text" 	# Search for text in the file(s)
	echo "3. Replace Text" 		# Replaces text in the file(s)
	echo "4. Delete Line"		# Deletes an entire line(s) in the file(s)
	echo "~~~~~~~~~~~~~~~~~"
	echo -e "Press Anything\nElse To Quit"
	echo "~~~~~~~~~~~~~~~~~"
	echo -n "ANS ==> "
}

## This function deletes a single line
single_line_delete() {

	# Asks user for what line they'd like to delete
	echo -en "\nEnter The Line Number You Would Like To Delete ==> "

	# Stores line number into variable
	read single_line_number

	# Appends a 'd' to the end of user input
	single_line_number+=d 

	# Asks user what file they'd like to delete from
	echo -en "And From What File ==> "

	# Stores file name into variable
	read single_line_file

	# Performs the deletion; deletes line X from file Y
	sed -i '' "$single_line_number" "$single_line_file"
}

multi_line_delete() {

	# Asks user for the beginning of the paragraph
	echo -en "\nEnter The First Line Number ==> "

	# Stores user input into variable
	read first_line_delete

	# Asks user for the end of the paragraph
	echo -n "Enter The Second Line Number ==> "

	# Stores user input into variable
	read second_line_delete

	# Appends a 'd' to the second line number
	second_line_delete+=d

	# Asks user what file they'd like to delete from
	echo -n "What File Would You Like To Delete From ==> "

	# Stores file name into variable
	read multi_line_file

	# Performs deletion; deleting all lines from X to Y in file Z
	sed -i '' -e "$first_line_delete,$second_line_delete" "$multi_line_file"
}

## This function prints the options corresponding to the "Delete Line" option
delete_line_menu() {

	# Notifies user what option is selected
	echo -e "\nYou Have Selected Option \"Delete Line\""
	
	# Sleep for a second so user has time to read
	sleep 1

	#Asks if you'd like to delete a single line or a paragraph
	echo -e "\nWould You Like To Delete A...:"
	echo -e "1. Single Line"
	echo -e "2. Continuous Lines"
	echo -n "ANS ==> "

	#Stores input into variable
	read what_line_input

	# If user input is 1, then
	if [ $what_line_input -eq 1 ]
	then
		single_line_delete	# Call the singe_line_delete function
	# If user input is 2, then
	elif [ $what_line_input -eq 2 ]
	then
		multi_line_delete 	# Call the multi_line_delete function
	else
		# Notifies user an incorrect option has been entered
		echo -e "\n!!! Not A Valid Option. Please Re-Read The Instructions & Try Again!!!"
	fi
}

## This function replaces text in a file specified by the user
replace_text() {

	# Notifies which option is selected
	echo -e "\nYou Have Selected Option \"Replace Text\"\n"
	
	# Sleeps for a second so user can read
	sleep 1

	# Asks what text should be replaced
	echo -en "What Text Would You Like To Replace ==> "

	# Stores input into variable
	read input_replace_text

	# Asks user what text should replace the old text
	echo -en "What Would You Like To Replace \"$input_replace_text\" With ==> "

	# Stores input into variable
	read input_new_text

	# Asks user for name of file to perform operation on
	echo -en "Please Enter The Name Of The File ==> "

	# Stores user input into variable
	read input_replace_text_file

	# Performs operation by replacing old text with new text in specified file
	sed -i '' "s/$input_replace_text/$input_new_text/g" "$input_replace_text_file"
}

## This function lists all the files in the directory in a simple or advanced list
list_files() {

	# Notifies user what option is selected
	echo -e "\nYou Have Selected Option \"List All Files\"\n"

	# Asks user for type of list; simple or advanced
	echo -en "Would You Like A Simple OR Advanced List?\n(S/A) ==> "

	# Stores user input into variable
	read file_list_input

	# If user input is lowercase or uppercase 's', then
	if [ $file_list_input == "s" ] || [ $file_list_input == "S" ]
	then 
		
		# Simple view header
		echo -e "\n#################################"
		echo "SIMPLE LIST OF FILES IN DIRECTORY"
		echo -e "#################################\n"
		
		# Lists all files in a simple manner to console
		ls
		
		# Simple view header
		echo -e "\n#################################"
		echo "SIMPLE LIST OF FILES IN DIRECTORY"
		echo -e "#################################\n"

	# If user input is lowercase or uppercase 'a', then:
	elif [ $file_list_input == "a" ] || [ $file_list_input == "A" ]
	then

		# Advanced view header
		echo -e "\n###################################"
		echo "ADVANCED LIST OF FILES IN DIRECTORY"
		echo -e "###################################\n"
		
		# Lists all files in an advanced fashion; list includes hidden files
		ls -l

		# Advanced view header
		echo -e "\n###################################"
		echo "ADVANCED LIST OF FILES IN DIRECTORY"
		echo -e "###################################\n"
	else

		# Informs user that input is not valid
		echo "I'm Sorry, I Don't Know That. Please Try Again."
	fi

	# Reminds user to write entire file name
	echo "*** Remember To Write The Entire Filename Including The Extension"
	
	# Prints examples of file extensions
	echo "*** [i.e. html, txt, java, py, c, sh, etc.]"
	
	# Reminder that file names are case sensitive
	echo "*** Also, File Names Are CaSe SeNsItIvE"
	
	# Tells user to press any key to continue
	echo -en "\nPress Any Key To Continue"

	# Advances flow of code
	read press_any_key
}

## This function searches for specific text and lists its location and line number
search_text() {

	# Searches text inside specified file and returns list of line number(s)
	search_text_line=`grep -n "$search_text_input" "$search_text_file" | cut -f1 -d:`
	
	# Variable that holds the empty char
	store_literal=""

	# Iterates through the list of numbers
	for line_number_file in $search_text_line
	do
		# Adds numbers to variable
		store_literal+="$line_number_file, "  
	done

	# Assigns one variable to another
	search_text_line=$store_literal

	# Prints out searched text
	echo -e "\nText: $search_text_input"

	# Prints out name of file
	echo "File: $search_text_file"

	# Prints out where the text was found and on what line
	echo "Line: ${search_text_line%,*}"

	# Sleeps for 2 seconds for readability
	sleep 2
}

## This function prints the search text menu and displays options for searching text
search_text_menu() {

	# Notifies what option is selected
	echo -e "\nYou Have Selected Option \"Search For Text\"\n"

	# Asks user what text should be searched for, and stores input into variable
	echo -en "What Text Would You Like To Search For?\n==> "
	read search_text_input

	# Asks user if all files or a specific file should be searched, and stores input
	echo -en "\nShould I Search In All Files Or A Specific File?\n(A/S)==> "
	read search_text_which_files

	# If user wants to search through all files; option 'a' selected, then
	if [ $search_text_which_files == "A" ] || [ $search_text_which_files == "a" ]
	then

		# Print border to console
		echo -en "\n-------------------------"
		
		# Iterate through all files in directory
		for i in $(ls) 
		do
			if 
				grep -q "$search_text_input" "$i" # If text is found in file, then
			then 
				search_text_file=$i # Assign file name to variable
				search_text search_text_input search_text_file # Call the search_text function with parameters
			fi
			echo -en "-------------------------" # Print border to console
		done
		echo "" # Prints newline to console
	
	# If user wants to search a specific file, option 's' selected, then
	elif [ $search_text_which_files == "S" ] || [ $search_text_which_files == "s" ] 
	then
		echo -en "\nWhat File Shall I Search In?\n==> " # Ask for file name
		read search_text_file # Store file name
		search_text search_text_input search_text_file # Search for specified text in specified file
		
		# Asks user if they need more info
		echo -en "\nWould You Like To See More Info?\n(Y/N)==> " 
		read more_info_yn # Accept input

		# If user inputs 'y'
		if [ $more_info_yn == "Y" ] || [ $more_info_yn == "y" ]
		then
			echo "" # Print newline
			grep -n "$search_text_input" "$search_text_file" # Perform deep search for text in file
			sleep 3 # Sleep for 3 seconds for readability
		# If user inputs 'n'
		elif [ $more_info_yn == "N" ] || [ $more_info_yn == "n" ]
		then
			echo -n "" # Print newline
		else
			# Inform user that input is not valid
			echo -e "\n!!! Not A Valid Option. Please Re-Read The Instructions & Try Again!!!"
		fi
	else
		# Inform user that input is not valid
		echo -e "\n!!! Not A Valid Option. Please Re-Read The Instructions & Try Again!!!"
	fi
}	
	
# If no args are given, then
if [ "$#" == "0" ]
then
	while [ true ]
	do
		# Print menu to terminal/console
		print_menu
		read long_input # Store user input

		# Check user input to see which function to execute
		if [ $long_input -eq 1 ]
		then
			list_files
		elif [ $long_input -eq 2 ]
		then
			search_text_menu
		elif [ $long_input -eq 3 ]
		then
			replace_text
		elif [ $long_input -eq 4 ]
		then
			delete_line_menu
		else
			echo -e "\nQuitting..."
			sleep 1
			break
		fi
	done

	# Print the final message
	ending_message

# If two args are given, then
elif [ "$#" == "2" ]
then
	echo -e "\n#NO CLI-gUI MODE#\n"
	replace_all $1 $2 # Replace all instances of first arg with second in all files
	ending_message

# If incorrect number of args are given, print error message with instructions
else
	echo -e "\n----------------------------------------"
	echo "| !!! INCORRECT USE OF EWE !!!         |"
	echo "| This Script Can Be Used Two Ways     |"    
	echo "| No Args ==> ./script.sh              |"
	echo "| Two Args ==> ./script.sh arg1 arg2   |"
	echo -e "----------------------------------------\n"
fi 

# # # # # # # # # # # # # # #
#            DRM            #
# # # # # # # # # # # # # # #
# mv script.sh image.sh.png #
# chmod a-rwx image.sh.png  #
# # # # # # # # # # # # # # #
#            DRM            #
# # # # # # # # # # # # # # #

: '

######################
### DEBUGGING CODE ###
######################

echo "Arg 0: $0"
echo "Arg 1: $1"
echo "Arg 2: $2"

if [ condition ]
then
    <code block>
elif [ condition ]
then
    <code block>
else
    <code block>
fi

echo "The script you are running has basename `basename "$0"`, dirname `dirname "$0"`"
echo "The present working directory is `pwd`"

basename `pwd`

for file in sample/*
do
    echo "$(basename "$file")"
done

for path in sample/*
do
    printf -- '%s\n' "${path##*/}"
done

for i in *
do 
	echo "$i"
done;

for i in $(ls) 
do
	#pseudo code below
	if [ grep "cat" ]
	if grep of $1 is something then replace with $2
	echo "$i"
done

if grep "test-word" tester.txt
then
	echo "yes"
else
	echo "no"
fi

echo -n "Look For ==> "
read var

for i in $(ls) 
do
	if 
		grep -q $var $i
	then 
		echo "Text Found: YES || File: $i"
	else 
		echo "Text Found: NO"
	fi
done

echo -n "Enter ==> "
read var
var_sanititzed=`echo $var | tr "[:upper:]" "[:lower:]"`

if [ $var_sanititzed == "Ubuntu" ]
then
  echo "Linux operating system"
else
  echo "Windows operating system"
fi

grep -n "pattern" sample.txt | cut -f1 -d:
result=$(grep -n "dog" "tester.txt" | cut -f1 -d:)

storeme=""
for value in $result
do
	storeme+="$value, "  
done
echo $storeme

echo ${storeme%,*}

######################
### DEBUGGING CODE ###
######################

'

# TODO:
# - Add more checks for things like file size and errors
# - Add more CLI commands
# - More fail-safes like guessing names of commands and files