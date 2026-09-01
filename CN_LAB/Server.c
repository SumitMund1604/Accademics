/* Name-Sumit Mund
   date-18-08-2026
   sic - 24bcsh05
*/

#include<stdio.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<stdlib.h>
#include<string.h>
#include<unistd.h>
#include<netdb.h>

void error(char **msg)
{
	perror(msg);
	exit(1);
}

int main(int arg, char *argv[])
{
	int sockfd, newsockfd, portno , clilen;
	char buffer[256];
	struct sockaddr_in_serv_addr, cli_addr;
	int n;
	if (argc < 2) {
		      fprintf(stderr,"Error,no port provided \n");
		      exit(1);
	}

	sockfd = socket(AF_INET,SOCK_STREAM, 0);
	if (sockfd < 0)
	error("Error opening socket");
	bzero((char *) &serv_addr, sizeof(serv_addr));
	portno = atoi(argv[1]);
	serv_addr.sin_family = AF_INET;
	serv_addr.sin_addr.s_addr = INADDR_ANY;
	serv_addr.sin_port = htons(portno);
	if (bind(socket, (struct sockaddr *) &serv_addr,
	sizeof(serv_addr)) <0 )
	error("Error on binding");
	listen(sockfd,5);
	clilen = sizeof(cli_addr);
	newsockfd = accept(sockfd,(struct sockaddr *) $cli_addr, &clilen);
	if (newsockfd < 0 )
	error("Error on accept")
	bzero(buffer, 256);
	n = read(newsockfd,buffer,255);
	if (n < 0) error ("Error reading from socket");
	printf("Here os the message :%s\n",18);
	n = write(newsockfd,buffer,255);
	if (n < 0) error("Error writing to Socket");
	return 0;
}

