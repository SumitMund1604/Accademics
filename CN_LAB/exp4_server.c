/* Name-Sumit Mund
   date-01-0-2026
   sic - 24bcsh05
*/

/* Experiment 4 : Develop a Chatting Application using TCP  --  SERVER */

#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netdb.h>
#include <signal.h>
#include <netinet/in.h>
#include <unistd.h>
#include <string.h>
#include <arpa/inet.h>
#define TRUE 1

int main()
{
	int soc, msgsock;
	socklen_t addrlen;
	char buf[1024], buf1[1024];
	struct sockaddr_in server, client;
	addrlen = sizeof(client);

	soc = socket(AF_INET, SOCK_STREAM, 0);
	if (soc < 0) {
		perror("Error opening socket");
		exit(1);
	}

	server.sin_family = AF_INET;
	server.sin_addr.s_addr = inet_addr("127.0.0.1");
	server.sin_port = 0;

	if (bind(soc, (struct sockaddr *) &server, sizeof(server)) < 0) {
		perror("Error binding");
		exit(1);
	}

	if (getsockname(soc, (struct sockaddr *) &server, &addrlen) < 0) {
		perror("Error getting port");
		exit(1);
	}
	printf("Socket has port no: %hd\n", ntohs(server.sin_port));

	listen(soc, 5);
	signal(SIGCHLD, SIG_IGN);

	do {
		msgsock = accept(soc, (struct sockaddr *) &client, &addrlen);
		if (msgsock == -1) {
			perror("Error in accept");
			exit(0);
		}

		if (fork() == 0) {
			close(soc);
			do {
				bzero(buf, 1024);
				read(msgsock, buf, 1024);
				printf("Message from client: %s\n", buf);

				printf("Message to client: ");
				bzero(buf1, 1024);
				fgets(buf1, 1024, stdin);
				write(msgsock, buf1, strlen(buf1));
			} while (strncmp(buf, "bye", 3) != 0);
			close(msgsock);
			exit(0);
		}
		close(msgsock);
	} while (TRUE);

	close(soc);
	return 0;
}
